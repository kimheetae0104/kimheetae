list.files()

titanic <- read.csv(  "titanic_2.csv" ) 
titanic

# 데이터의 앞부분을 확인

head(titanic,8)
tail(titanic,8)

# 데이터 속성별 자료형태 출력 
str(titanic)
# 데이터 크기는 행 * 열 

summary(titanic)

#사분위수를 시각화한 그래프
boxplot(titanic$Fare)
#데이터 개수 알아보기

table(titanic$Embarked)
#데이터 차원 출력
dim(titanic)

#wordcloud2 패키지 설치 및 적용
install.packages("devtools")

library(devtools)
library(devtools)
devtools::install_github("lchiffon/wordcloud2")

library(wordcloud2)

#wordcloud2를 그리는 방법 
# 단어와 해당되는 반도수를 데이터프레임으로 만들면 끝

word <- c("강성돔", "굴찜", "대방어", "고등어" , "해삼")
fre <- c(100,10,30,80,90)
food <- data.frame(word,fre)
food
# 패키지 안에 있는 함수의 속성을 알 수 있는 방법
??wordcloud2
wordcloud2(food,size = 1,fontFamily = "궁서체", color="random-light")

list.files()
baseball <- read.csv("baseball.csv")

bb<- data.frame(구단 = baseball$구단,승=(baseball$승)^4)
bb

wordcloud2(bb, size = 0.5, fontFamily = "바탕체", color = "random-dark")

list.files()
stu <- read.csv("대학 계열별 학과수 및 학년별 재적학생수.csv")
stu

st1 <- data.frame(학과별= stu$소계열,학과수=(stu$학과수))
wordcloud2(st1,size = 0.5)

st2 < - data.frame(학과별 = stu$소계열,재적학생수=(stu$재적학생수))
wordcloud2(st2)

remotes::install_github("mrchypark/multilinguer") 
#java, rjava 설치
install.packages("multilinguer")
library(multilinguer)

install_jdk()

#의존성 패키지 설치
install.packages(c("hash", "tau", "Sejong", "RSQLite", "devtools", "bit", "rex", "lazyeval", "htmlwidgets", "crosstalk", "promises", "later", "sessioninfo", "xopen", "bit64", "blob", "DBI", "memoise", "plogr", "covr", "DT", "rcmdcheck", "rversions"), type = "binary")

remotes::install_github('haven-jeon/KoNLP', upgrade = "never", INSTALL_opts=c("--no-multiarch"))

library(KoNLP)

v1 <- "치킨이 먹고싶다"

extractNoun(v1)

useNIADic()

list.files()

# 엑셀 또는 메모장의 데이터를 한 줄씩 읽어와서 
#벡터 형태로 저장하는 함수 
news <- readLines("2021_11_29_기준 인공지능 뉴스제목 500개.csv")
news

news_noun <- extractNoun(news)

head(news_noun)
# 리스트형태의 데이터를 벡터로 변환하는 함수 
news_unlist <- unlist(news_noun)
news_unlist
# 빈도수를 확인하는 함수 
result1 <- table(news_unlist)

#정렬하기 
result2<-sort(result1, decreasing = TRUE)

#wordcloud2 패키지 사용하기 
library(wordcloud2)
wordcloud2(result2, size = 1)
result3 <- result2[-1]
result3
wordcloud2(result3, size = 0.5)











