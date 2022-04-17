Insertion Sortit
[22,27,16,2,18,6]
/*Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
Big-O gösterimini yazınız.
Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.


[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
*/

1.adım => [2,27,16,22,18,6] en küçük eleman ile baştaki elemanın yerini değiştirdik.
2.adım => [2,6,16,22,18,27] artık 2. sıradaki elmanın en küçük olmasını istiyoruz bu yüzden 6 ile 27 yer değiştirir.
3.adım => [2,6,16,18,22,27] bundan sonra işleme son sıradaki elemmana ulaşana kadar devam ediyoruz.
4.adım => [2,6,16,18,22,27] dizi içerisindeki tüm elemanlar sıralandı işlemi artık sonlandırıyoruz.


[7,3,5,8,2,9,4,15,6]

1.adım => [2,3,5,8,7,9,4,15,6]
2.adım => [2,3,4,8,7,9,5,15,6]
3.adım => [2,3,4,5,7,9,8,15,6]
4.adım => [2,3,4,5,6,9,8,15,7]
5.adım => [2,3,4,5,6,7,8,15,9]
6.adım => [2,3,4,5,6,7,8,15,9]
7.adım => [2,3,4,5,6,7,8,9,15]


