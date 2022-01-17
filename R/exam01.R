# 벡터 :동일한 자료가 일차원으로 나열된 것 
vec1 <-c(10,20,30,40,50)
vec1
vec2 <- c("사과",100, TRUE)
vec2


v_no<- seq(1:7)
v_no<- 1:7
v_no<- c(1:7)
v_no
v_name <-c("Apple","Peach","Banana","Grape","Kiwi","Orange","Mango")
v_name
v_price <-c(500,200,100,300,150,250,450)
v_price
v_stock <-c(5,2,4,7,5,3,8)
v_stock
# dataFrame 만드는 방법 data.frame()
sales <- data.frame(v_no, v_name, v_pric, v_stock)
sales

#자료구조를 좀 더 괜찮게 보는 방법 
View(sales)
# 데이터를 꺼냈는데 [] 가 없다면 data.frame 인 것을 쉽게 알수 있다 
v_no

# DataFrame에서 원하는 데이터만 조회하기 
# sales 데이터프레임에서 v_name 값만 뽑아서 보기 
# 해결방법 $ 를 쓰면 된다 
# column을 빼면 대괄호가 생긴다 

sales$v_name

# grape만 뽑고 싶을때 하나만 뽑고 싶을때 [행,열]
sales[4,2]
sales[3,] #3번째 행 전체 값을 가져옴 프레임 형태로 나옴 
sales[ ,2] # 컬럼 명으로 벡터 형태로 출력됨 


# 데이터프레임에서 컬럼의 개수를 알 수 있는 방법 

ncol(sales)
sales[1,3:ncol(sales)]
# 데이트프레임에서 행의 개수를 알 수 있는 방법
nrow(sales)
# 데이터프레임에서 컬럼의 이름들만 추출하는 방법
names(sales)

# 다양한 함수를 데이터프레임에 적용하기
# 엑셀에서 사용하던 sum, div, add 등
sum(sales$v_pric) # 총합 
mean(sales$v_pric) #평균값 
round(mean(sales$v_pric), digits = 2) # 소숫점 정리
min(sales$v_pric)
max(sales$v_pric)
range(sales$v_pric)

No <- seq(1:10)
No
Name <- c("이은비","김서아","장하윤","유이서","나서윤","이지안","박나은","황유나","김하율","윤시아")
Name
Kor<- c(80,76,26,61,44,19,53,81,26,64)
Kor
Eng<- c(8,76,69,18,82,56,48,14,73,83)
Eng
Math<- c(65,27,100,76,37,77,73,19,74,60)
Math

Score <- data.frame(No,Name, Kor, Eng, Math)
Score

Score$Kor
Score[,3]
Score$Eng
Score$Name
names(Score)
ncol(Score)
nrow(Score)
Score[0,0:ncol(Score)]  # 이건 잘못된 표현 행열은 1부터 시작하기 때문이다 
Score[10,10:nrow(Score)]
names(Score)
round(mean(Score$Kor), digits = 1)
mean(Score$Kor)
max(Score$Eng)
min(Score$Math)


# 내가 작업하는 공간에 파일들의 목록 보기 
list.files(score.xlsx)
# 엑셀 데이터파일을 읽을 수 있는 함수들이 모여있는 패키지 다운로드하기 
install.packages("readxl")
# 한번만 해주면 끝~~~

#패키지를 로딩하여 사용하기
library(readxl)
#함수를 사용하여 파일 불러오기
Score_jan <- read_excel("score.xlsx",sheet="January") # 꼭 기억하기 파일명과 확장자까지 철자 틀리면 안됨
Score_jan
Score_fab <- read_excel("score.xlsx",sheet = "February")
Score_fab

# csv 파일을 읽어와서 데이터 프레임 형태로 저장
titanic<- read.csv("titanic.csv")
titanic


#문자열 데이터를 범주형으로 읽어들이는 옵션 
titanic_2 <- read.csv("titanic_2.csv", stringsAsFactors = T )


list.files()

heart <- read.csv("heart_failure_clinical_records_dataset.csv", stringsAsFactors = T)
# 통계에서는 행을 관측치(observation)라고 하고 열을 변수(variables)라고 함 
