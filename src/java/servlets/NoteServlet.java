/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 807785
 */
public class NoteServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException 
    {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String title = br.readLine();
        String contents = br.readLine();
        
        br.close();

        Note note = new Note(title, contents);
        req.setAttribute("note", note);       

        String val = req.getParameter("edit");

        if (val != null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(req, resp);
        }
        else 
        {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException 
    {
        String newTitle = req.getParameter("title");
        String newContents = req.getParameter("contents");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(
                new FileWriter(path, false))); 
        
        Note note = new Note(newTitle, newContents);
        req.setAttribute("note", note);
        
        pw.write(note.getTitle() + "\n");
        pw.write(note.getContents());
        pw.flush();
        pw.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
            .forward(req, resp);
    }
}