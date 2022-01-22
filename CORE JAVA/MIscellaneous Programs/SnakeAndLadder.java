package Miscellaneous_Programs;

public class SnakeAndLadder 
{
	public static void main(String[] args) 
	{
		int position1=0;
		int position2=0;
		int i=2;
		
		while(position1<100 && position2<100)
		{
			double a=Math.floor( ((Math.random()*10) % 6)+1 );
			double b=Math.floor((Math.random()*10) % 2);
			int dice=(int)a;
			int check=(int)b;
			
			if(i%2==0)
			{
				switch (check) 
				{
				
					case 1: 
						position1=position1+dice;
						break;
					case 0: 
					{
						position1=position1-dice;
						if(position1<0)
							position1=0;
						break;
					}
					
				}
				if(position1>100)
					position1=position1-dice;
				if(position1==100)
					{
					System.out.println("Player1 wins");
					System.out.println("Position= "+position1);
					break;
					}
			}
			else
			{
				switch (check) 
				{
				
					case 1: 
						position2=position2+dice;
						break;
					case 0: 
					{
						position2=position2-dice;
						if(position2<0)
							position2=0;
						break;
					}
					
				}
				if(position2>100)
					position2=position2-dice;
				if(position2==100)
				{
				System.out.println("Player2 wins");
				System.out.println("Position= "+position2);
				break;
				}
			}
			i++;
		}

	}

}
