import java.util.*;
class emp
{
public static void main(String[] args)
{
	String[][] x={{"Emp No","Emp Name","Join Date","Designation Code","Department Code",
"Department","Basic" ,"HRA","IT"},{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
{"1005","Ranjan,","16/07/2005","m","Engg","50000","20000","20000"},
{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};

	String[][] y = {{"Designation Code","Designation","DA"},{"e","Consultant","32000"},
	{"c","Consultant","32000"},{"k","Clerk","12000"},
	{"r","Receptionist","15000"},{"m","Manager","40000"}};
	String z[][]={{"Emp no.","Emp Name","Department Acct","Designation Clerk","Salary"},
								{"","","","",""}};
	int flag=0;
	for (int i=0;i<8;i++)
	{
		if(x[i][0].equalsIgnoreCase(args[0]))
		{
			flag=1;
			z[1][0]=x[i][0];
			z[1][1]=x[i][1];
			z[1][2]=x[i][4];
			for(int j=0;j<6;j++)
			{
				if(x[i][3].equalsIgnoreCase(y[j][0]))
				{
					z[1][3]=y[j][1];
					z[1][4]=Integer.toString(Integer.parseInt(x[i][5])+Integer.parseInt(x[i][6])+Integer.parseInt(y[j][2])-Integer.parseInt(x[i][7]));
				}
			}
		}
	}

	if(flag==0)
	{
		System.out.println("There is no employee with empid :" + args[0]);
	}
	else
	{
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print(z[i][j]+"  ");
		}
		System.out.println();
	}
}

}
}
