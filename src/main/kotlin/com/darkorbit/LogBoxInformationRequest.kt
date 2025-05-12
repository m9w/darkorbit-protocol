package com.darkorbit

interface LogBoxInformationRequest : ProtocolPacket {
	var adler32Checksum: Int
	var classId: Int
	var clipSize: String
	var crc32Checksum: Int
	var endian: String
	var length: Int
	var pixelColor: Int
	var quality: Int
	var typeId: Int
}
