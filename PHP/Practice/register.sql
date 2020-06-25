-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 25, 2020 lúc 10:35 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `register`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `register`
--

CREATE TABLE `register` (
  `id` int(11) NOT NULL,
  `fullname` varchar(255) CHARACTER SET utf8 NOT NULL,
  `email` varchar(125) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `register`
--

INSERT INTO `register` (`id`, `fullname`, `email`, `username`, `password`) VALUES
(1, '', '', '', '$2y$10$MTALmAPb76CaGVMmWqf02Oy'),
(7, 'Nguyen Dac Dat', 'nddat1824@gmail.com', 'nddat1824', '$2y$10$a2ppJegMDyWC1Zetsfsumul'),
(9, 'dac dat', 'nddat_php@gmail.com', 'nddat_php', '$2y$10$wr/QrtdT/9t30nxLno/qxOc'),
(10, 'ndd', 'DatNDTH1908022@fpt.edu.vn', 'dat_fai', '$2y$10$hMaQclJLCWp96hxJLfMmtuU'),
(11, 'Nguyen Dac Dat', 'nddat333@gmail.com', 'nddat333', '$2y$10$PIyxygtrvtOwvXMmhLq.ses'),
(13, 'Nguyen Dac Dat', 'nddat999@gmail.com', 'nddat999', '$2y$10$q1KeaiA0S7a7prTKTwiqKO9'),
(14, 'Nguyen Dac Dat', 'nddat555@gmail.com', 'nddat555', '$2y$10$q7pWZVDUOrsuWI8KeSGjYuW'),
(20, 'Nguyen Dac Dat', 'nddatppp@gmail.com', 'nddatppp', '$2y$10$1v52vOjv14qWOcROzxOpaeQ'),
(23, 'Nguyen Dac Dat', 'nddatxxx@gmail.com', 'nddatxxx', '$2y$10$07nGzWGzPMujv9YAhuBOnuC');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `register`
--
ALTER TABLE `register`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
