package basic.dev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStreamReader irs = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(irs);

		System.out.println("Thông tin sinh viên");

		System.out.println("Nhập tên : ");
		String ten = sc.nextLine();

		System.out.println("Nhập CMND : ");
		int cmnd = sc.nextInt();

		System.out.println("Nhập mã sinh viên : ");
		long maSinhVien = sc.nextLong();

		System.out.println("Nhập Tên lớp : ");
		String lop = sc.nextLine();

		System.out.println("Nhập tên trường : ");
		String tenTruong = sc.nextLine();

		System.out.println("Nhập điểm trung bình : ");
		float dtb = sc.nextFloat();
		
		System.out.println("----------------");

		System.out.println("Thông tin công nhân ");

		System.out.println("Nhập tên ");

		String nhapten = sc.nextLine();
		System.out.println("Nhập địa chỉ : ");
		String diaChi = sc.nextLine();

		System.out.println("Nhập số ĐT : ");
		int soDT = sc.nextInt();

		System.out.println("Nhập hệ số lương : ");
		double soLuong = sc.nextDouble();
		
		System.out.println("---------------");
		
		System.out.println("Thông tin xe ");
		
		System.out.println("Nhập tên : ");
		String tenXe = sc.nextLine();
		
		System.out.println("Nhập hãng : ");
		String hang = sc.nextLine();
		
		System.out.println("Nhập giá : ");
		double gia = sc.nextDouble();
		
		System.out.println("Nhập màu sơn : ");
		String mauSon = sc.nextLine();
		
	}

}
