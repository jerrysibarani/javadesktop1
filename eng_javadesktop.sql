-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Jun 2021 pada 08.44
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eng_javadesktop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `invoiceno` varchar(30) NOT NULL,
  `itemcode` varchar(30) NOT NULL,
  `itemname` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `measure` varchar(30) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `employee_code` varchar(100) NOT NULL,
  `employee_name` varchar(100) NOT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `place_birth` varchar(200) NOT NULL,
  `date_birth` date DEFAULT NULL,
  `education` varchar(10) DEFAULT NULL,
  `departemen` varchar(100) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `address` varchar(300) DEFAULT NULL,
  `postal_code` char(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `employee`
--

INSERT INTO `employee` (`id`, `employee_code`, `employee_name`, `gender`, `place_birth`, `date_birth`, `education`, `departemen`, `position`, `phone`, `status`, `address`, `postal_code`) VALUES
(64, '12345678', 'Tika', 'Female', 'Magetan', '1997-08-12', 'S1', 'IT', 'Staff', '082128036833', 'Waiting', 'penjaringan', '16353738'),
(65, '2012171030', 'Fadya', 'Female', 'Jakarta', '1997-10-26', 'S1', 'Marketing', 'Staff', '0862627277', 'Lajang', 'Jl raya bekasi', '16167'),
(63, '2013191003	', 'ANDRI', 'Male	', 'BEKASI', '1997-08-12', 'S1	', 'IT	', 'Manager	', '09813131	', 'STATUS WA	', 'JL ABCAAA	', '123-000	'),
(60, '2020202012', 'Kusumah', 'Male', 'Jakarta', '2000-01-01', 'S2', 'IT', 'Staff', '0928894999', 'Duda', 'jalan ku', '135888'),
(61, '2022181137', 'Ayuda Ramani', 'Female', 'Lampung Tengah', '1998-08-12', 'SMK', 'Staff', 'Direktur Utama ', '081540956424', 'Lajang', 'Jakarta', '13740'),
(58, '233339500', 'M. Agus Surya', 'Male', 'Jakarta', '1990-08-08', 'SMA', 'Gudang', 'Direksi', '021000000', 'Lajang', 'jl. dki jakarta', '12399');

-- --------------------------------------------------------

--
-- Struktur dari tabel `item`
--

CREATE TABLE `item` (
  `itemcode` varchar(50) NOT NULL,
  `itemname` varchar(100) DEFAULT NULL,
  `price` double NOT NULL,
  `measure` varchar(20) DEFAULT NULL,
  `stock` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `item`
--

INSERT INTO `item` (`itemcode`, `itemname`, `price`, `measure`, `stock`) VALUES
('A001', 'Shampoo', 10000, 'Pcs', 200),
('A002', 'Soap', 5000, 'Pcs', 202),
('A003', 'Tooth Paste', 2000, 'Pcs', 203),
('A004', 'Tooth Brush', 8000, 'Pcs', 204),
('A005', 'Folding Chair', 340000, 'Pcs', 200),
('A006', 'Folding Table', 540000, 'Pcs', 20),
('A007', 'Cup', 5500, 'Pcs', 2000),
('A008', 'Knife Kitchen', 9500, 'Pcs', 150);

-- --------------------------------------------------------

--
-- Struktur dari tabel `orderdetail`
--

CREATE TABLE `orderdetail` (
  `id` int(11) NOT NULL,
  `invoiceno` varchar(50) NOT NULL,
  `itemcode` varchar(50) NOT NULL,
  `itemname` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `measure` varchar(30) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `orderdetail`
--

INSERT INTO `orderdetail` (`id`, `invoiceno`, `itemcode`, `itemname`, `price`, `measure`, `qty`, `total`) VALUES
(20, 'F20210620132245', 'A001', 'Shampoo', 10000, 'Pcs', 3, 30000),
(21, 'F20210620132245', 'A002', 'Soap', 5000, 'Pcs', 5, 25000),
(22, 'F20210620132245', 'A003', 'Tooth Paste', 2000, 'Pcs', 10, 20000),
(23, 'F20210620132245', 'A004', 'Tooth Brush', 8000, 'Pcs', 2, 16000),
(24, 'F20210620133734', 'A001', 'Shampoo', 10000, 'Pcs', 2, 20000),
(25, 'F20210620133734', 'A002', 'Soap', 5000, 'Pcs', 5, 25000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `orders`
--

CREATE TABLE `orders` (
  `invoiceno` varchar(50) NOT NULL,
  `transaction_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `issued_by` varchar(50) DEFAULT NULL,
  `customer_code` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `orders`
--

INSERT INTO `orders` (`invoiceno`, `transaction_date`, `issued_by`, `customer_code`) VALUES
('F20210620132245', '2021-06-20 06:28:38', 'DESKTOP-LBJC87I', 'C001'),
('F20210620133734', '2021-06-20 06:44:05', 'DESKTOP-LBJC87I', 'c005');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`itemcode`);

--
-- Indeks untuk tabel `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD PRIMARY KEY (`id`,`invoiceno`);

--
-- Indeks untuk tabel `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`invoiceno`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=127;

--
-- AUTO_INCREMENT untuk tabel `orderdetail`
--
ALTER TABLE `orderdetail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
