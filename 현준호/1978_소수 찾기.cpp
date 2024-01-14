#include <iostream>
using namespace std;

int main()
{
	int N, num, answer = 0;
	cin >> N;
	
	while (N--)
	{		
		cin >> num;

			bool check = false;
			for (int i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					check = true;
					break;
				}					
			}
			if (num != 1 && !check)
				answer++;			
	}
	cout << answer << '\n';
}