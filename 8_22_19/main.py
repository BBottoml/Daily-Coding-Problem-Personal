# python implementation
# implemented incorrectly 
# implementation only works if there is at most 1 missing 
# value between min and max 

'''
Given an array of integers, find the first missing positive integer in 
linear time and constant space. In other words, 
find the lowest positive integer that does 
not exist in the array. 
The array can contain duplicates and negative numbers as well.
'''

''' 
Remarks:
This has to be done in O(n) time complexity 
and O(1) space complexity

These constraints mean that we cannot sort the 
array and we are not allowed to implement a data structure
due to the space constraint. Hence, 
my implementation will be a dynamic approach where we scan 
through the array to determine the min pos int

Edge cases:
there exist no min pos int => 1 will be returned
array empty => 1 returned

'''
def main():
    # test cases provided
    a = [3, 4, -1, 1]
    b = [1, 2, 0]
    c = [2,-9, 6, 10, 3]

    print(missing_int(a)) # should return 2
    print(missing_int(b)) # should return 3
    print(missing_int(c)) # should return 

# will return the lowest missing positive integer 
def missing_int(some_list):
    
    if some_list == []:
        return 1

    min_int = 0 # we need to find the min pos int
    max_int = 0 # we need to determine the max pos int

    # scan through array in O(n) time
    # and determine the min pos int
    for some_int in some_list:
        
        # O(1) time operations to determine min int 
        if min_int == 0 and some_int > min_int:
            min_int = some_int
        
        elif min_int != 0 and some_int > 0 and some_int < min_int:
            min_int = some_int
        
        # O(1) time operations to determine max int
        if max_int == 0 and some_int > max_int:
            max_int = some_int

        elif max_int != 0 and some_int > max_int:
            max_int = some_int

    if min_int == 0 or max_int == 0:
        return 1

    max_min = max_int + min_int

    for some_int in some_list:

        if some_int > 0 and some_int != max_int and some_int != min_int:
            max_min -= some_int
    if max_min < min_int:
        return min_int + 1
    else: 
        return max_min

if __name__ == "__main__":
    main()
