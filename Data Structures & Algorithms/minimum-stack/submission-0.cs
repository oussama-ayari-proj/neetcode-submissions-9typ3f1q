public class MinStack {

   Stack<int> s  = new Stack<int>(); 

    public MinStack()
    {
        Stack<int> s = new Stack<int>();
    }

    public void Push(int val)
    {
          s.Push(val);
    }

    public void Pop()
    {
         s.Pop();
    }

    public int Top()
    {
       return  s.Peek();
    }

    public int GetMin()
    {
         int min = s.Peek();

        foreach (var item in s)
        {
            if(item<min)
                min = item;
        }
        return min ;
    }


}
