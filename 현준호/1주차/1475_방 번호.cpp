#include <iostream>

using namespace std;

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);

	int numSet[10] = {};

	string s = "";
	int maxNum = 0;

	cin >> s;
	for (char c : s)
	{
		int num = (int)(c - '0');

		if (c == '9')
			num = 6;

		numSet[num]++;
	}

	if (numSet[6] > 1)
		numSet[6] = (numSet[6] / 2) + (numSet[6] % 2);

	for (int i = 0; i < 10; i++)
		maxNum = (int)max(maxNum, numSet[i]);

	cout << maxNum;
}