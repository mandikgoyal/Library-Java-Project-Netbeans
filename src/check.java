/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ryan
 */
public class check {
    public check(String uname,String upass) {
    try{
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Library","root","TIGER");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from library.login where eid='"+uname+"' and password='"+upass+"'");
        if(rs.next())
    {
      String s=rs.getString(1);
      String p=rs.getString(2);
System.out.println(s+p);
      if(s.equals(uname)&&(p.equals(upass)))
      {JOptionPane.showMessageDialog(null,"Welcome to Library Management,You Are Authorized to Work");
      MainUI mn=new MainUI();
      mn.setVisible(true);
      


      }


    }
else
          JOptionPane.showMessageDialog(null,"Invalid Information Please Re-Enter");
        

    } catch(ClassNotFoundException e)
    {System.out.println(e);} catch (SQLException e) {
        System.out.println(e);
        } catch (HeadlessException e) {
            System.out.println(e);
        }


}

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
