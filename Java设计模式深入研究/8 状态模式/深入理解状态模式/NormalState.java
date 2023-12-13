public class NormalState implements ICellState{
public boolean phone(CellContext ct) {
System.out.println(ct.name +"：手机处于正常状态");
int minute = (int)(Math.random()*10+1); //随机产生打电话分钟数
ct.cost(minute); //计算电话消费，cost()方法在CellContext类中实现
//保存信息到数据库的正常表中
return false;
}
}