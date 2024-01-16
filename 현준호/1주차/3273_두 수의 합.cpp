#include<iostream>
#include<vector>

using namespace std;

int check[1000001];
int main()
{
	ios::sync_with_stdio();
	cin.tie(0);

	int n , x;
	cin >> n;

	vector<int> vec(n);
	int answer = 0;

	for (int i= 0; i< n; i++)
		cin >> vec[i];

	cin >> x;

	for (int i = 0; i < n; i++)
	{
		check[vec[i]] = true;
		
		int num = x - vec[i];

		if (num > 0 && num < 1000001)
		{
			if (vec[i] != num && check[num])
				answer++;				
		}
	}
	cout << answer;
}