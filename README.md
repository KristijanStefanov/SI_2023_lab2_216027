<pre><code>```
Kristijan Stefanov 216027 

3.цикломатската комплексност = број на ребра - број на јазли + 2 = 38-29+2 = 11

4.Every bracnh   User=0,List[..] | User(Kiko,em=stekiko@yahoo.com,finki123),List[Kiko,Ste,..] | User(0,em=stekikoyahoo.com,fnki1),List[Kiko,..] |  User                                                                                                                     (Kiko,em=stekiko@yahoo.com,finki123_),List[Kiko,Ste,..]
    
1,2 - 3                    *                                                                                            
3 - 28                     *
1,2 - 4                                                                     *                                           *                             *
4 - 5                                                                                                                   *
5 - 6                                                                                                                   *
4 - 6                                                                       *                                                                         *
6 - 7                                                                                                                   *
7 - 8                                                                       *                                                                         *
7 - 16,17,18                                                                                                            *
8 - 9.1                                                                     *                                                                         *
9.1 - 9.2                                                                   *                                                                         *
9.2 - 10                                                                    *                                                                         *
9.2 - 15                                                                    *                                                                         *
10 - 11                                                                     *                                                                         *
11 - 12                                                                     *                                                                         *
11 - 13                                                                     *                                                                         *
12 - 13                                                                     *                                                                         *
13 - 9.3                                                                    *                                                                         *
13 - 14                                                                     *                                                                         *
14 - 9.3                                                                    *                                                                         *
9.3 - 9.2                                                                   *                                                                         *
15 - 16,17,18                                                               *                                                                         *
16,17,18 - 19                                                               *                                                                         *
19 - 20                                                                                                                 *
19 - 21                                                                     *                                                                         *
20 - 28                                                                                                                 *
21 - 22                                                                     *                                                                         *
22 - 27
22 - 23.1                                                                   *                                                                         *
23.1 - 23.2                                                                 *                                                                         *
23.2 - 27                                                                   *                                                                         *
23.2 - 24                                                                   *                                                                         * 
23.3 - 23.2                                                                 *                                                                         *
24 - 23.3                                                                   *                                                                         *
24 - 25                                                                                                                                               *
25 - 23.3                                                                                                                                             *
25 - 28                                                                                                                                               *
27 - 28                                                                     *




5. if (user==null || user.getPassword()==null || user.getEmail()==null).
       T                  T                             T
       T                  T                             F - pagja na RuntimeEx prvite linii kod poradi .getpw() and .getemail()
       T                  F                             T - pagja na RuntimeEx prvite linii kod poradi .getpw() and .getemail()
       T                  F                             F - pagja na RuntimeEx prvite linii kod poradi .getpw() and .getemail()
       F                  T                             T
       F                  T                             F - pagja na RuntimeEx prvite linii kod poradi .getpw() and .getemail()
       F                  F                             T - pagja na RuntimeEx prvite linii kod poradi .getpw() and .getemail()
                                                    

User(0,0,0)
User(0,0,1)
User(0,1,0)
User(0,1,1)
User(1,0,0)
User(1,0,1)
User(1,1,0)
 ```</code></pre>
