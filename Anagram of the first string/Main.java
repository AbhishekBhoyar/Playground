def anagrams(string1,string2):
  list1 = sorted(list(string1))
  list2 = sorted(list(string2))
  
  return (list1 == list2)

word1 = input()
word2 = input()

iftrue = anagrams(word1,word2)

if (iftrue):
  print("Anagram")
else:
  print("Not anagrams")