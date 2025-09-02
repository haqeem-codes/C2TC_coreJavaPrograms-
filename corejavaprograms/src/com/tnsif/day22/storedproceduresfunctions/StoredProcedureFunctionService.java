package com.tnsif.day22.storedproceduresfunctions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.tnsif.day22.preparedstatementinterface.DBUtil;

public class StoredProcedureFunctionService {
    static Connection con;
    static Statement st;
    static PreparedStatement pst;
    static CallableStatement cst;
    static {
        try {
            con = DBUtil.getConnectionObject(); 
            st = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudents() throws SQLException {
        boolean result = st.execute("call deleteStudent()");
        if (!result) {
            System.out.println(st.getUpdateCount() + " record(s) Deleted");
        }
    }

    public static void deleteStudentsByCity(String city) throws SQLException {
        pst = con.prepareStatement("call deleteStudentBycity(?)");
        pst.setString(1, city);
        boolean result = pst.execute();
        if (!result) {
            System.out.println(pst.getUpdateCount() + " record(s) Deleted");
        }
    }

    public static String getstudentName(int id) throws SQLException {
        cst = con.prepareCall("{? = call getStudentNameById(?)}");
        cst.registerOutParameter(1, Types.VARCHAR);
        cst.setInt(2, id);
        cst.execute();
        return cst.getString(1);
    }
}
