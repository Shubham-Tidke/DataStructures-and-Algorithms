# Algorithms
All attempted codes for mentioned algorithms

1. Quick-find-Algorithm

  Algorithm used to solve dynamic connectivity problems.
  It will check if two mentioned objects are connected or not.
  Used data structure : Arrays
  Defect : 1.Fails for large amount of data. 2. Too expensive[n^2].
  
2.Quick-union-Algorithm
  
  Alternative to Quick-find-Algorithm as it becomes too slow for huge problems.
  Used data structure : Arrays
  To check whether the provided objects are connected or not, the algorithm checks whther the objects have same root value.
  If they have same root value, they are connected.
  Defects : 1. Trees can get too tall which may cause find operation expensive.
            2. Algorithm is faster than QUick-find but slower for many other examples.[O(n)]
            
 3.Quick-union-Algorithm[improvement 1]
  An improvisation to Quick-union-Algorithm to avoid tall trees[Also known as Weighted-quick-union].
  Improvisation  : Avoid connecting larger trees under smaller tress.
                   array SZ[] to maintain size of an object .
  Used data structure : Arrays
  Performance : Faster than Quick-union. [ln(n)]
  Advantage : Weighted-quick-union will have average distance from root much lower than Quick-union as the tree created won't get taller.
