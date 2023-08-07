# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get mecha-tauri could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/mecha-tauri/0.0.0"
SRC_URI += "git://github.com/Dhruvesh08/tauri-starter.git;protocol=https;nobranch=1;branch=main"
SRCREV = "966101bb2aa39d04a744f3321826ba15159ca96a"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+966101bb2a"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.20.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/alloc-no-stdlib/2.0.4 \
    crate://crates.io/alloc-stdlib/0.2.2 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anyhow/1.0.72 \
    crate://crates.io/atk-sys/0.15.1 \
    crate://crates.io/atk/0.15.1 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.68 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.3.3 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block/0.1.6 \
    crate://crates.io/brotli-decompressor/2.3.4 \
    crate://crates.io/brotli/3.3.4 \
    crate://crates.io/bstr/1.6.0 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/bytemuck/1.13.1 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cairo-rs/0.15.12 \
    crate://crates.io/cairo-sys-rs/0.15.1 \
    crate://crates.io/cargo_toml/0.15.3 \
    crate://crates.io/cc/1.0.82 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cfb/0.7.3 \
    crate://crates.io/cfg-expr/0.15.4 \
    crate://crates.io/cfg-expr/0.9.1 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.26 \
    crate://crates.io/cocoa-foundation/0.1.1 \
    crate://crates.io/cocoa/0.24.1 \
    crate://crates.io/color_quant/1.1.0 \
    crate://crates.io/combine/4.6.6 \
    crate://crates.io/convert_case/0.4.0 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/core-graphics-types/0.1.2 \
    crate://crates.io/core-graphics/0.22.3 \
    crate://crates.io/cpufeatures/0.2.9 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-utils/0.8.16 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/cssparser-macros/0.6.1 \
    crate://crates.io/cssparser/0.27.2 \
    crate://crates.io/ctor/0.1.26 \
    crate://crates.io/darling/0.20.3 \
    crate://crates.io/darling_core/0.20.3 \
    crate://crates.io/darling_macro/0.20.3 \
    crate://crates.io/deranged/0.3.7 \
    crate://crates.io/derive_more/0.99.17 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/dirs-next/2.0.0 \
    crate://crates.io/dirs-sys-next/0.1.2 \
    crate://crates.io/dispatch/0.2.0 \
    crate://crates.io/dtoa-short/0.3.4 \
    crate://crates.io/dtoa/1.0.9 \
    crate://crates.io/dunce/1.0.4 \
    crate://crates.io/embed-resource/2.2.0 \
    crate://crates.io/embed_plist/1.2.2 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.2 \
    crate://crates.io/fastrand/2.0.0 \
    crate://crates.io/fdeflate/0.3.0 \
    crate://crates.io/field-offset/0.3.6 \
    crate://crates.io/filetime/0.2.22 \
    crate://crates.io/flate2/1.0.26 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.2.0 \
    crate://crates.io/futf/0.1.5 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/fxhash/0.2.1 \
    crate://crates.io/gdk-pixbuf-sys/0.15.10 \
    crate://crates.io/gdk-pixbuf/0.15.11 \
    crate://crates.io/gdk-sys/0.15.1 \
    crate://crates.io/gdk/0.15.4 \
    crate://crates.io/gdkwayland-sys/0.15.3 \
    crate://crates.io/gdkx11-sys/0.15.1 \
    crate://crates.io/generator/0.7.5 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/gimli/0.27.3 \
    crate://crates.io/gio-sys/0.15.10 \
    crate://crates.io/gio/0.15.12 \
    crate://crates.io/glib-macros/0.15.13 \
    crate://crates.io/glib-sys/0.15.10 \
    crate://crates.io/glib/0.15.12 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.13 \
    crate://crates.io/gobject-sys/0.15.10 \
    crate://crates.io/gtk-sys/0.15.3 \
    crate://crates.io/gtk/0.15.5 \
    crate://crates.io/gtk3-macros/0.15.6 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.14.0 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.2 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/html5ever/0.25.2 \
    crate://crates.io/http-range/0.1.5 \
    crate://crates.io/http/0.2.9 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.57 \
    crate://crates.io/ico/0.3.0 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.4.0 \
    crate://crates.io/ignore/0.4.20 \
    crate://crates.io/image/0.24.6 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indexmap/2.0.0 \
    crate://crates.io/infer/0.12.0 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/itoa/0.4.8 \
    crate://crates.io/itoa/1.0.9 \
    crate://crates.io/javascriptcore-rs-sys/0.4.0 \
    crate://crates.io/javascriptcore-rs/0.16.0 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni/0.20.0 \
    crate://crates.io/js-sys/0.3.64 \
    crate://crates.io/json-patch/1.0.0 \
    crate://crates.io/kuchiki/0.8.1 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.147 \
    crate://crates.io/line-wrap/0.1.1 \
    crate://crates.io/linux-raw-sys/0.4.5 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/log/0.4.19 \
    crate://crates.io/loom/0.5.6 \
    crate://crates.io/mac/0.1.1 \
    crate://crates.io/malloc_buf/0.0.6 \
    crate://crates.io/markup5ever/0.10.1 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matches/0.1.10 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/ndk-context/0.1.1 \
    crate://crates.io/ndk-sys/0.3.0 \
    crate://crates.io/ndk/0.6.0 \
    crate://crates.io/new_debug_unreachable/1.0.4 \
    crate://crates.io/nodrop/0.1.14 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.2.16 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/num_enum/0.5.11 \
    crate://crates.io/num_enum_derive/0.5.11 \
    crate://crates.io/objc/0.2.7 \
    crate://crates.io/objc_exception/0.1.2 \
    crate://crates.io/objc_id/0.1.1 \
    crate://crates.io/object/0.31.1 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/open/3.2.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/pango-sys/0.15.10 \
    crate://crates.io/pango/0.15.10 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/pathdiff/0.2.1 \
    crate://crates.io/percent-encoding/2.3.0 \
    crate://crates.io/phf/0.10.1 \
    crate://crates.io/phf/0.8.0 \
    crate://crates.io/phf_codegen/0.8.0 \
    crate://crates.io/phf_generator/0.10.0 \
    crate://crates.io/phf_generator/0.8.0 \
    crate://crates.io/phf_macros/0.10.0 \
    crate://crates.io/phf_macros/0.8.0 \
    crate://crates.io/phf_shared/0.10.0 \
    crate://crates.io/phf_shared/0.8.0 \
    crate://crates.io/pin-project-lite/0.2.11 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/plist/1.5.0 \
    crate://crates.io/png/0.17.9 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/precomputed-hash/0.1.1 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.20+deprecated \
    crate://crates.io/proc-macro2/1.0.66 \
    crate://crates.io/quick-xml/0.29.0 \
    crate://crates.io/quote/1.0.32 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_pcg/0.2.1 \
    crate://crates.io/raw-window-handle/0.5.2 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-automata/0.3.6 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.7.4 \
    crate://crates.io/regex/1.9.3 \
    crate://crates.io/rustc-demangle/0.1.23 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.38.7 \
    crate://crates.io/rustversion/1.0.14 \
    crate://crates.io/ryu/1.0.15 \
    crate://crates.io/safemem/0.3.3 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/selectors/0.22.0 \
    crate://crates.io/semver/1.0.18 \
    crate://crates.io/serde/1.0.183 \
    crate://crates.io/serde_derive/1.0.183 \
    crate://crates.io/serde_json/1.0.104 \
    crate://crates.io/serde_repr/0.1.16 \
    crate://crates.io/serde_spanned/0.6.3 \
    crate://crates.io/serde_with/3.2.0 \
    crate://crates.io/serde_with_macros/3.2.0 \
    crate://crates.io/serialize-to-javascript-impl/0.1.1 \
    crate://crates.io/serialize-to-javascript/0.1.1 \
    crate://crates.io/servo_arc/0.1.1 \
    crate://crates.io/sha2/0.10.7 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/simd-adler32/0.3.7 \
    crate://crates.io/siphasher/0.3.10 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.11.0 \
    crate://crates.io/soup2-sys/0.2.0 \
    crate://crates.io/soup2/0.2.1 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/state/0.5.3 \
    crate://crates.io/string_cache/0.8.7 \
    crate://crates.io/string_cache_codegen/0.5.2 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.28 \
    crate://crates.io/system-deps/5.0.0 \
    crate://crates.io/system-deps/6.1.1 \
    crate://crates.io/tao-macros/0.1.1 \
    crate://crates.io/tao/0.16.2 \
    crate://crates.io/tar/0.4.39 \
    crate://crates.io/target-lexicon/0.12.11 \
    crate://crates.io/tauri-build/1.4.0 \
    crate://crates.io/tauri-codegen/1.4.0 \
    crate://crates.io/tauri-macros/1.4.0 \
    crate://crates.io/tauri-runtime-wry/0.14.0 \
    crate://crates.io/tauri-runtime/0.14.0 \
    crate://crates.io/tauri-utils/1.4.0 \
    crate://crates.io/tauri-winres/0.1.1 \
    crate://crates.io/tauri/1.4.1 \
    crate://crates.io/tempfile/3.7.1 \
    crate://crates.io/tendril/0.4.3 \
    crate://crates.io/thin-slice/0.1.1 \
    crate://crates.io/thiserror-impl/1.0.44 \
    crate://crates.io/thiserror/1.0.44 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time-core/0.1.1 \
    crate://crates.io/time-macros/0.2.11 \
    crate://crates.io/time/0.3.25 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio/1.29.1 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.7.6 \
    crate://crates.io/toml_datetime/0.6.3 \
    crate://crates.io/toml_edit/0.19.14 \
    crate://crates.io/tracing-attributes/0.1.26 \
    crate://crates.io/tracing-core/0.1.31 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.17 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/treediff/4.0.2 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.11 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/url/2.4.0 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/uuid/1.4.1 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/version-compare/0.0.11 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/vswhom-sys/0.1.2 \
    crate://crates.io/vswhom/0.1.0 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.87 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.87 \
    crate://crates.io/wasm-bindgen-macro/0.2.87 \
    crate://crates.io/wasm-bindgen-shared/0.2.87 \
    crate://crates.io/wasm-bindgen/0.2.87 \
    crate://crates.io/webkit2gtk-sys/0.18.0 \
    crate://crates.io/webkit2gtk/0.18.2 \
    crate://crates.io/webview2-com-macros/0.6.0 \
    crate://crates.io/webview2-com-sys/0.19.0 \
    crate://crates.io/webview2-com/0.19.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-bindgen/0.39.0 \
    crate://crates.io/windows-implement/0.39.0 \
    crate://crates.io/windows-metadata/0.39.0 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.1 \
    crate://crates.io/windows-tokens/0.39.0 \
    crate://crates.io/windows/0.39.0 \
    crate://crates.io/windows/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.39.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.39.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.39.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.39.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.39.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winnow/0.5.4 \
    crate://crates.io/winreg/0.11.0 \
    crate://crates.io/wry/0.24.3 \
    crate://crates.io/x11-dl/2.21.0 \
    crate://crates.io/x11/2.21.0 \
    crate://crates.io/xattr/0.2.3 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://;md5=generateme \
"

SUMMARY = "A Tauri App"
HOMEPAGE = "https://github.com/Dhruvesh08/tauri-starter"
LICENSE = ""

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include mecha-tauri-${PV}.inc
include mecha-tauri.inc
