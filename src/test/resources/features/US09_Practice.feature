Feature: herokuapp Delete Test
  Scenario: TC01 herokuapp adresinden delete butonu calismali
Given Kullanici "herokuappURL" anasayfasinda
And add element butonuna basar
And kullanici 3 sn bekler
Then Delete butonu gorunur oluncaya kadar bekler
And delete butonun gorunur oldugunu test eder
Then Delete butonuna basar
And Delete butonun gorunmedigini test eder
And sayfayi kapatir
