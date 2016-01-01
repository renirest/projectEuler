import itertools
def main():
    x = list(itertools.permutations([0,1,2,3,4,5,6,7,8,9]))
    print (x[999999])
if __name__ == "__main__": main()
