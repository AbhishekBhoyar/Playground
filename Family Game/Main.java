n = int(input())
xy = str(input())
arr = []

z = n
l =len(xy)

for i in range(n):
    arr.append(True)

i,j = 0,0

while n!=1:
    if arr[i]==True:
        if xy[j] == 'y':
            arr[i] = False
            n = n - 1
            j = j + 1
        else:
            j = j + 1
    i = i + 1
    if i >= z:
        i = 0
    if j>=l:
        j = 0
    
for i in range(z):
    if arr[i] == True:
        print(i + 1)
