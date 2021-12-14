import re

def solution(new_id):
    answer = new_id.lower()
    
    answer = re.sub("[^a-z\d\-\_\.]", "", answer)
    # print("2단계",answer)
    
    answer = re.sub("\.\.+", ".", answer)
    # print("3단계", answer)
    
    answer = re.sub("^\.|\.$", "", answer)
    
    answer = re.sub("^$", "a", answer)
    
    answer = answer[:15]
    answer = re.sub("\.$", "", answer)
    
    answer = answer if len(answer) >2 else answer + answer[-1]*(3-len(answer))
    
    return answer