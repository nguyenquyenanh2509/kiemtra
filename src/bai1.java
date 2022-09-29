import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] arr = {0};
        int arr1 = 0;
        do {
            System.out.println("****************MeNu*************");
            System.out.println("1.Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            System.out.println(" lựa chon của bạn là :");
            int luachon = sr.nextInt();
            switch (luachon) {
                case 1:
                    System.out.println("nhap vao chi so cua mang");
                    arr1 = sr.nextInt();
                    arr = new int[arr1];
                    System.out.println("nhap cac phan tu cua mang");
                    for (int i = 0; i < arr1; i++) {
                        arr[i] = sr.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("cac phan tu cua mang la :");
                    for (int i = 0; i < arr1; i++) {
                        System.out.printf("%d\t ", arr[i]);
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("cac so nguyen to trong mang la: ");
                    for (int i = 0; i < arr1; i++) {
                        if (arr[i] >= 2) {
                            boolean check = false;
                            for (int j = 2; j < arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    check = true;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d\t", arr[i]);
                            }
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    int min = arr[0];
                    for (int i = 1; i < arr1; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.printf("phan tu nho nhat la  %d\n", min);
                    int max = arr[0];
                    for (int i = 1; i < arr1; i++) {
                        if (arr[i] > min) {
                            max = arr[i];
                        }
                    }
                    System.out.printf("phan tu lon nhat la  %d\n", max);
                    break;
                case 5:
                    System.out.println("mang sau khi sap xep giam dan la");
                    for (int i = 0; i < arr1 ; i++) {
                        for (int j =i+1; j < arr1; j++) {
                            if (arr[i] < arr[j]) {
                                int c = arr[i];
                                arr[i] = arr[j];
                                arr[j] = c;
                            }
                        }
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.println("\n");

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon tu 1-6");
            }

        } while (true);
        }
    }



