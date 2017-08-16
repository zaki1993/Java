private static void swap(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    int partition(String[] arr, int left, int right)
    {
        int startIdx = left;
        String pivot = arr[right];
        for(int i = left; i < right; ++i)
        {
            if(arr[i].compareTo(pivot) >= 0)
            {
                swap(arr, startIdx, i);
                startIdx++;
            }
        }
        swap(arr, right, startIdx);
        return startIdx;
    }

    void quicksort(String[] arr, int left, int right)
    {
        if(left >= right)
        {
            return;
        }
        else
        {
            int pivotIdx = partition(arr, left, right - 1);
            if(left < pivotIdx - 1)
            {
                quicksort(arr, left, pivotIdx);
            }
            if(pivotIdx < right)
            {
                quicksort(arr, pivotIdx + 1, right);
            }
        }
    }
