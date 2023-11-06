import java.sql .Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class DBManager {
    public static Connection connection;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/uni?useUnicode=true&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static  ArrayList<Student> getAllStudents(){
        ArrayList<Student> students =new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement("select * from student");
            ResultSet res=st.executeQuery();
            while(res.next()) {
                Integer id = res.getInt("id");
                String name=res.getString("name");
                String surname=res.getString("surname");
                String groups =res.getString("groups");
                String profession = res.getString("profession");
                students.add(new Student(id,name,surname, groups,profession));
            }
            st.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public void addStudent(Student student){
        try {
            PreparedStatement st = connection.prepareStatement(
                    "INSERT INTO student (name, surname, groups , profession) VALUES (?, ?, ?, ?)");
            st.setString(1, student.getName());
            st.setString(2, student.getSurname());
            st.setString(3, student.getGroups());
            st.setString(4, student.getProfession());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public  void deleteStudent(String id){
        System.out.println("delete of student");
        {
            try{
                PreparedStatement st = connection.prepareStatement("DELETE FROM student WHERE id = ?");
                st.setString(1, id);
                st.executeUpdate();
                st.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


//    public static void updateArea(){
//
//        ArrayList<Student> studentss = getAllStudents();
//        DeleteStudent.area.setText("");
//        String s="";
//        for(Student p: studentss){
//            s=s+p.toString()+"\n";
//        }
//        DeleteStudent.area.append(s);
//    }



}