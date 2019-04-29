import java.io.*;
import java.lang.*;
import java.util.*;
public class sshService {
    public static void main(String[] args) throws IOException
    {
        String[] command = {"/usr/bin/ssh","-p","27018","yikes.asphyxia.site","-D","9999"};
        ProcessBuilder p = new ProcessBuilder(command);
        System.out.println("command is: "+p.command());
        Process p2 = p.start();

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        String s = null;
        while((s = stdIn.readLine()) != null)
        {
            System.out.println(s);
        }
    }
}
