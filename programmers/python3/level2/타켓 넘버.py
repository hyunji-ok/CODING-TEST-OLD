from collections import deque 

def solution(numbers, target):
    answer = 0
    que = [[0,0]] 

    count = 0
    while que:
      idx, cur_sum = que.pop()

      if idx == len(numbers) and cur_sum ==target:
            answer+=1

      else:
        try:
         que.append([idx+1, cur_sum+numbers[idx]]) 
         que.append([idx+1, cur_sum-numbers[idx]]) 
        except:
          pass
      
    #   count+=1
    #   print(que)
    # print(count)
    return answer

# numbers = [1, 1, 1, 1, 1]
# target = 3

# solution(numbers, target)