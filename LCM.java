class LCM
{
public static void main(String[] args)
{
int res = lcm(4,10);
System.out.println(res);
}
static int lcm(int a,int b){
int n=a>b?a:b;
while(true){
if(n%a==0 && n%b==0) return n;
n++;
}
}
}
