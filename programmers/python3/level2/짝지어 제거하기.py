def solution(s):
    stack = []
    
    for i in range(len(s)):
        if stack:
            temp = stack.pop()

            if temp == s[i]:
                pass
            else:
                stack.append(temp)
                stack.append(s[i])
        else:
            stack.append(s[i])
        
    if stack:
        return 0
    else:
        return 1
