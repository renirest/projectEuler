import itertools
def main():
    counter = 1

    while(True):
        two = counter*2
        three = counter*3
        four = counter *4
        five = counter*5
        six = counter*6

        if(sameDigits(two,counter) and sameDigits(three, counter) and sameDigits(four,counter) and sameDigits(five, counter) and sameDigits(six,counter)):
            print(counter)
            break
        counter = counter + 1
def sameDigits(x,y):
    if str(x) in ([''.join(perm) for perm in itertools.permutations(str(y))]):
        return True
    else:
        return False

if __name__ == "__main__": main()
