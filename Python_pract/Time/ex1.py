import time

t = time.ctime()
print(t)

localtime = time.localtime()
lt = time.strftime("%a",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%A",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%B",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%b",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%H",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%l",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%j",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%I",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%m",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%p",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%w",localtime)
print(lt)

# Date represents
localtime = time.localtime()
lt = time.strftime("%x",localtime)
print(lt)

#
localtime = time.localtime()
lt = time.strftime("%X",localtime)
print(lt)

# Day and time Representation
localtime = time.localtime()
lt = time.strftime("%c",localtime)
print(lt)

# year without date Representation
localtime = time.localtime()
lt = time.strftime("%y",localtime)
print(lt)

# year with century
localtime = time.localtime()
lt = time.strftime("%Y",localtime)
print(lt)

# timezone Representation
localtime = time.localtime()
lt = time.strftime("%Z",localtime)
print(lt)

localtime = time.localtime()
lt = time.strftime("%z",localtime)
print(lt)