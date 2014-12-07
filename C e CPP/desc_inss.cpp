#include <stdio.h>
#include <conio.h>

int main ()
{
	float sal;


	printf("digite o salario");
	scanf("%f", &sal);
	
	if (sal<=600)
		printf("isento");
	else
		if ((sal>600) && (sal<=1200))
			printf("desconto de %.2f", sal * 0.2);
		else
			if ((sal>1200) && (sal<=2000))
				printf("desconto de %.2f", sal * 0.25);
			else
				if (sal>2000)
					printf("desconto de %.2f", sal * 0.3);

	getch();
	return(0);
}