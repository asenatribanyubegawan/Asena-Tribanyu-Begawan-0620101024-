import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UTS 
{
	public static void main (String args[])
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String npm;
		String nama;
        float ipk;

		try
		{
			System.out.println("Masukan Data Mahasiswa");

			System.out.print("NPM   : "); 
			npm = input.readLine();

            System.out.print("Nama  : "); 
			nama = input.readLine();

			System.out.print("IPK   : ");
			ipk = Float.parseFloat(input.readLine());

			System.out.println("_______________________________");
            System.out.println("                               ");
			System.out.println("        DATA  MAHASISWA        ");
			System.out.println("_______________________________");
			System.out.println("NPM   : " + npm);
			System.out.println("Nama  : " + nama); 
			System.out.println("IPK   : " + ipk); 
		}
		catch(IOException eox) 
		{
			System.out.println(eox);
		}
	}
}