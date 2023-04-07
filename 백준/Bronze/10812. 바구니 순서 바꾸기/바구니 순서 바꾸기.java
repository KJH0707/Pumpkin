import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken())-1;
            int mid = Integer.parseInt(st.nextToken()) - 1;
            int[] box = new int[end-begin+1];

            for (int j=0;j<box.length;j++){
                box[j] = arr[mid];
                if (mid<end) {
                    mid++;
                }
                else {
                    mid=begin;
                }
            }
            int index = 0;
            for (int k=begin;k<=end;k++) {
                arr[k]=box[index];
                index++;
            }

        }
        for (int j = 0; j < N; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}