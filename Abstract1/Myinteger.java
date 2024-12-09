
public class Myinteger implements Comparison
{
public int isGreater(Object a, Object b)
{
if ((Integer)a>(Integer)b)
return 1;
else 
return 0;
}

public int isLess(Object a, Object b)
{
if ((Integer)a<(Integer)b)
return 1;
else 
return 0;
}

public int issEqual(Object a, Object b)
{
if ((Integer)a==(Integer)b)
return 1;
else 
return 0;
}

}
