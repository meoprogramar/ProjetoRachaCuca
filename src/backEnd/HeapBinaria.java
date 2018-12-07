package backEnd;


import java.util.ArrayList;

public class HeapBinaria 
{       
    public void buildHeap(ArrayList<Participante> fila)
    {
        for(int i=(fila.size()/2)-1; i>=0; i--)
            maxHeapify(fila, i);     
        System.out.println("");
    }
    
    public void maxHeapify(ArrayList<Participante> arr, int i)
    {
        int left = left(i);
        int right = right(i);
        int maior;

        if(left < arr.size() && arr.get(left).key > arr.get(i).key)
            maior = left;
        else
            maior = i;
        if(right < arr.size() && arr.get(right).key > arr.get(maior).key)
            maior = right;
        if(maior!=i)
        {
            Participante temp = arr.get(i);
            arr.set(i, arr.get(maior));
            arr.set(maior, temp);
            maxHeapify(arr, maior);
        }
    }
    
    public void extractMax(ArrayList<Participante> arr)
    {
        if(arr.size()<1)
            return;
        arr.set(0, arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        maxHeapify(arr, 0);
    }
    
    public int left(int i)
    {
        return (2*i)+1; 
    }
    
    public int right(int i)
    {
        return (2*i)+2; 
    }      
}
