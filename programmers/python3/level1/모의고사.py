def solution(answers):
    answer = []
    
    count1 = 0
    count2 = 0
    count3 = 0
    
    num1 = [1,2,3,4,5]
    num2 = [2,1,2,3,2,4,2,5]
    num3 = [3,3,1,1,2,2,4,4,5,5]
    
    for i in range(len(answers)):
        if answers[i] == num1[i%len(num1)]:
            count1+=1
        if answers[i] == num2[i%len(num2)]:
            count2+=1
        if answers[i] == num3[i%len(num3)]:
            count3+=1
    
    answer_temp = [count1, count2, count3]
    
    for person, score in enumerate(answer_temp):
        if score == max(answer_temp):
            answer.append(person+1)

    return answer