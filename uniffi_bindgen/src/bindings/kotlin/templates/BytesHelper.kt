public object FfiConverterBytes: FfiConverterRustBuffer<List<Byte>> {
    override fun read(buf: ByteBuffer): List<Byte> {
        val len = buf.getInt()
        val byteArr = List<Byte>(len)
        buf.get(byteArr)
        return byteArr
    }
    override fun allocationSize(value: List<Byte>): Int {
        return 4 + value.size
    }
    override fun write(value: List<Byte>, buf: ByteBuffer) {
        buf.putInt(value.size)
        buf.put(value)
    }
}
