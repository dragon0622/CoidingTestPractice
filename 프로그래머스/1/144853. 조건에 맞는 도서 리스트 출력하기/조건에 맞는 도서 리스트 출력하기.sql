-- 코드를 입력하세요
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from book
where  category = '인문' and year(PUBLISHED_DATE) = '2021'
order by PUBLISHED_DATE