package com.deepak.backend;

import com.deepak.connection.DbConnection;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class FollowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String followerIdParam = request.getParameter("followerId");
        String followedIdParam = request.getParameter("followedId");

       if (followerIdParam != null && followedIdParam != null) {
    int followerId = Integer.parseInt(followerIdParam);
    int followedId = Integer.parseInt(followedIdParam);
    
    // Aapka code jaari rakhe...
    // ...
} else {
    // Handle the case when parameters are missing or null
    // ...
}
        Connection con=null;
        try {
             con=DbConnection.getConnect();
             con.setAutoCommit(false);
            // Insert the follow relationship into the database
            PreparedStatement stmt = con.prepareStatement("INSERT INTO user_relationships (follower_id, followed_id) VALUES (?, ?)");
            int followerId = 0;
            stmt.setInt(1, followerId);
            int followedId = 0;
            stmt.setInt(2, followedId);     

            // Close connections
            stmt.close();
            con.close();

            response.sendRedirect("profile.jsp?userId=" + followedId);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any database errors
        }
    }
}
