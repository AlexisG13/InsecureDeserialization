import java.io.*;
public class Main {

    public static void main(String[] args) {
	    User user = new User("test","test");
	    String filename = "user.txt";

	    //Serialización del objeto en un archivo txt
	    try(FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialización del txt a un objeto de tipo usuario SIN VERIFICAR D:

        try(FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file)){
                User userdata = (User)in.readObject();
            } catch(IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
}}
