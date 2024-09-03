package dsa.old.practices.conditional_loops;

import java.util.Scanner;

public class _13_Depreciation_Value_Of_Product {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the assert value");
        float assetValue = scanner.nextFloat();
        System.out.println("Enter the depreciation percentage");
        float depPercent = scanner.nextFloat();
        System.out.println("Enter the used years / life of asset");
        float year = scanner.nextFloat();
        findDepreciationApproach1(assetValue, depPercent, year);
        System.out.println("=================================");
        findDepreciationApproach2(assetValue, depPercent, year);

    }

    private static void findDepreciationApproach1(float assetValue, float depPercent, float year ){
        float modifiedAssetValue = assetValue;
        for(int i = 1; i <= year; i++){
            modifiedAssetValue = ((100 - depPercent) * modifiedAssetValue) / 100;
        }
        System.out.println("Value of asset after depreciation is  "+modifiedAssetValue);
    }

    private static void findDepreciationApproach2(float assetValue, float depPercent, float year){

        // Depreciation = asset value * depreciation interest / 100 per year.
        float depreciationValuePerYear = 0;
        float depreciationValue = 0;
        while(year > 0){
            depreciationValuePerYear = (assetValue * depPercent) / 100;
            depreciationValue = depreciationValue + depreciationValuePerYear;
            assetValue = assetValue - depreciationValuePerYear;
            year--;
        }
        System.out.println("Value of asset after depreciation is  "+assetValue);
        System.out.println("Value of depreciation is  "+depreciationValue);
    }
}
