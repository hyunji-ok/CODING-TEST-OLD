def solution(array, commands):
    answer = []
    for numbers in commands:
        temp = array[numbers[0]-1:numbers[1]]
        temp.sort()
        number = temp[numbers[2]-1]
        answer.append(number)
    return answer