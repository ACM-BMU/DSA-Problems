#https://www.hackerrank.com/challenges/the-minion-game/problem

def minion_game(string):
    vow = 'AEIOU'
    kev,stu = 0,0
    for i in range(len(string)):
        if(string[i] in vow):
            kev+=(len(string)-i)
        else:
            stu+=(len(string)-i)
    if(kev>stu):
        print("Kevin",kev)
    elif(stu>kev):
        print("Stuart",stu )
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)