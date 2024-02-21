-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, date_format(hire_ymd, "%Y-%m-%d") from doctor
where MCDP_CD = "cs" or mcdp_CD = "GS"
order by HIRE_YMD desc, dr_name