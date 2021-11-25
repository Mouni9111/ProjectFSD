package file_handling;
import java.io.*;
import java.util.Scanner;

public class Filehandling {

	public static void main(String[] args) {
		int i,j;
		int choice1 = 0;
		Scanner scan = new Scanner(System.in);
		File folder= new File("D:\\Eclipse Project\\File_Handling_Project");
		System.out.println("Virtual Key for Your Repositories - Developed by G.K. Mounika\n");
		while(true)
		{
			System.out.println("Please choose your input between 1 to 3\n");
			System.out.println("1. Retrieve File Names In Ascending Order\n");
			System.out.println("2. Perform File Operations\n");
			System.out.println("3. Terminate The Program\n");
			int choice=scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1: File array1[]=folder.listFiles();
			for(int i1=0;i1<array1.length;i1++)
			{
				System.out.println(array1[i1]);
			}
			break;
			case 2: 
				boolean c=true;
				do {
					System.out.println("What would you like to do?\n");
				System.out.println("1. Add A New File or Folder on the Main Directory\n");
				System.out.println("2. Delete a file or folder\n");
				System.out.println("3. Search for a file or folder\n");
				System.out.println("4. Return to Previous Menu\n");
				System.out.println("5. Exit the program\n");
				choice1=scan.nextInt();
				scan.nextLine();
				switch(choice1)
				{
				case 1: System.out.println("What would you like to create?\n 1.File\n 2.Folder");
				i=scan.nextInt();
				scan.nextLine();
				if(i>2 || i<1)
				{
					System.out.println("Invalid Input. Please try again.\n");
				}
				else if(i==1)
				{
					System.out.println("Please input the name of the File\n");
					String nam=scan.nextLine();
					File f=new File("D:\\Eclipse Project\\File_Handling_Project\\"+nam);
					try {
						f.createNewFile();
						System.out.println("File Created Successfully\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					System.out.println("Please input the name of the Folder\n");
					String namf=scan.nextLine();
					File f=new File("D:\\Eclipse Project\\File_Handling_Project\\"+namf);
					f.mkdirs();
					System.out.println("File Created Successfully\n");
				}
				break;
				case 2:
					System.out.println("What would you like to delete?\n 1.File\n 2.Folder");
					i=scan.nextInt();
					scan.nextLine();
					boolean del=false;
					if(i>2 || i<1)
					{
						System.out.println("Invalid Input. Please try again.\n");
					}
					else if(i==1)
					{
						System.out.println("Please input the name of the File\n");
						String nam=scan.nextLine();
						File f=new File("D:\\Eclipse Project\\File_Handling_Project\\"+nam);
						del=f.delete();
						if(del==false)
						{
							System.out.println("File Not Found\n");
							del=false;
						}
						else
						{
						System.out.println("File Deleted Successfully");
						}
					}
					else
					{
						System.out.println("Please input the name of the Folder\n");
						String namf=scan.nextLine();
						File f=new File("D:\\Eclipse Project\\File_Handling_Project\\"+namf);
						del=f.delete();
						if(del==false)
						{
							System.out.println("Folder Not Found\n");
							del=false;
						}
						else
						{
						System.out.println("Folder Deleted Successfully\n");
						}
					}
					break;
				case 3:
					System.out.println("Please input the name of the File or Folder to Search\n");
					String nam=scan.nextLine();
					File f=new File("D:\\Eclipse Project\\File_Handling_Project");
					File array[]=f.listFiles();
					int count=0;
					System.out.println("Searched Result:\n\n");
					for(int g=0;g<array.length;g++)
					{
						if(array[g].getName().startsWith(nam))
						{
							System.out.println(array[g]);
							count++;
						}
					}
					System.out.println("\n\n");
					if(count==0)
					{
						System.out.println("File Not Found\n");
					}
					break;
				case 4:System.out.println("Returning to main menu\n");
				c=false;
					break;
				case 5:System.out.println("Thank you for using our application");
				c=false;	
				break;
				}
				}while(c==true);
				break;
			case 3: System.out.println("Thank you for using our application");
			break;
			default:
				System.out.println("Incorrect input. Please enter a value within the range indicated\n");
			}
			if(choice==3 || choice1==5)
			{
				break;
			}
		}
		scan.close();
	}

}
