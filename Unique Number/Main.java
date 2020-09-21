def reverse(X):
    rev = 0
    while (X>0):
        remainder = X%10
        rev = rev * 10 + remainder
        X = X//10
    return rev

a = int(input())
b = int(input())

x = list(range(a, b+1))
#print(x)

y = []

for i in range(0,len(x)):
    num1 = x[i]
    num = reverse(num1)
    y.append(num)
#print(y)

z = []

for i in range(0,len(y)):
    z.append(abs(x[i]-y[i]))
#print(z)

count = 0
for i in range(0,len(z)):
    if z[i] == 0:
        count = count
    elif z[i]%9 == 0:
        count = count + 1
if count != 0:
	print(count)
elif count == 0:
	print("No Unique Number")