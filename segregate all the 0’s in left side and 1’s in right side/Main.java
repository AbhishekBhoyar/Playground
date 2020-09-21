def zeros_and_ones(a , b):
  lst = []
  for i in range(0,a):
    lst.append(0)
  for j in range(0,b):
    lst.append(1)
  return lst
if __name__ == "__main__":
  count = int(input())
  
  lst1 = str(input())
  list4 = list(lst1)

  count0 = 0
  count1 = 0

  for i in range(0 , len(list4)):
    if lst1[i] == '0':
      count0 = count0 + 1
    elif lst1[i] == '1':
      count1 = count1 +1
  list3 = zeros_and_ones(count0, count1)
  for i in range(0,count):
    print(list3[i],end="")