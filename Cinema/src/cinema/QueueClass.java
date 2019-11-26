/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
interface Queue
{
	abstract  public void add(Object obj);
	abstract  public Object first();
	abstract  public Object remove();
	abstract  public int  size();
}

     public    class QueueClass implements Queue
{
	 private Object arr[];
	 private int size ;
	 public QueueClass(int size)
	 {
	 	 
	 	 arr=new Object[size];
	 }
	 public void add(Object obj)
	 {
	 	 arr[size++]=obj;
	 }

	 public Object first()
	 {
	 	if(size==0)throw new IllegalStateException("stack is empty ");
	 	return arr[0];

	 }

	 public int size()
	 {
	 	 return size;

	 }

	 public Object remove()
	 {
	 	 if(size==0)throw new IllegalStateException("stack is empty");
	 	 --size;
	 	 Object obj=arr[0];
	 	 System.arraycopy(arr ,  1, arr , 0 , size );
	 	 return  obj;

	 }

}